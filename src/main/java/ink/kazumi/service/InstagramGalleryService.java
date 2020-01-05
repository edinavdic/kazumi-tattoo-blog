package ink.kazumi.service;

import ink.kazumi.model.GalleryPost;

import java.util.List;

public class InstagramGalleryService implements GalleryService {

    private static InstagramGalleryService service;

    private InstagramGalleryService() {}

    public static synchronized InstagramGalleryService getInstance(){
        if(service == null)
            service = new InstagramGalleryService();
        return service;
    }

    @Override
    public List<GalleryPost> getGalleryPosts() {
        return null;
    }
}
