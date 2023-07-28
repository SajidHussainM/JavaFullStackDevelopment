package org.studyeasy.showroom.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.studyeasy.showroom.hibernate.entities.BrandEntity;
import org.studyeasy.showroom.services.BrandsService;


@Path("/showroom/brands")
public class Brands{
	BrandsService service = new BrandsService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<BrandEntity> getBrands() {
		List<BrandEntity> list = service.getBrands();
		return list;
	}
	
	@GET
	@Path("/{brandId}")
	@Produces(MediaType.APPLICATION_JSON)
	public BrandEntity getBrands(@PathParam("brandId") int brandId) {
		return service.getBrand(brandId);
	}
	


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postBrands(BrandEntity brand, @Context UriInfo uri) {
	  URI location = uri.getAbsolutePath();
	  service.addBrand(brand);
	  return Response.created(location).entity(brand).build();
			  //status(Status.CREATED).entity(brand).build();
	}

	@PUT
	@Path("/{brandId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putBrands(@PathParam("brandId") int brandId, BrandEntity updatedBrand) {
		updatedBrand.setBrandId(brandId);
		service.updateBrand(updatedBrand);
	}

	@DELETE
	@Path("/{brandId}")
	public void deleteBrands(@PathParam("brandId") int brandId) {
		service.deleteBrand(brandId);
	}

}
