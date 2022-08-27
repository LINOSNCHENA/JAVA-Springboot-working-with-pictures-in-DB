package com.bytes.photos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.bytes.photos.model.FileModel;

@Transactional
public interface FileRepository extends JpaRepository<FileModel, Long>
{	
	public FileModel findByName(String name);
}