package patterns.structural.bridge.resource;

public class ArtistResource implements IResource {

	private String snippet;
	private String image;
	private String title;
	private String url;

	public ArtistResource(String snippet, String image, String title, String url) {
		this.snippet = snippet;
		this.image = image;
		this.title = title;
		this.url = url;
	}



	@Override
	public String snippet() {
		return this.snippet;
	}

	@Override
	public String image() {
		return this.image;
	}

	@Override
	public String title() {
		return this.title;
	}

	@Override
	public String url() {
		return this.url;
	}

}
