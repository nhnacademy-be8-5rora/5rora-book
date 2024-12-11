package store.aurora.book.book.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import store.aurora.book.book.entity.Publisher;
import store.aurora.book.book.repository.PublisherRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PublisherService {
    private final PublisherRepository publisherRepository;

    public Publisher findOrCreatePublisher(String publisherName) {
        return publisherRepository.findByName(publisherName)
                .orElseGet(() -> {
                    Publisher newPublisher = new Publisher();
                    newPublisher.setName(publisherName);
                    return publisherRepository.save(newPublisher);
                });
    }

    public List<Publisher> findAll() {
        return publisherRepository.findAll();
    }


    public void deleteById(Long id) {
        publisherRepository.deleteById(id);
    }
}
