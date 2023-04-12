package com.files.example.files_folders.repositories;

import com.files.example.files_folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FileRepository extends JpaRepository<File, Long> {
}
