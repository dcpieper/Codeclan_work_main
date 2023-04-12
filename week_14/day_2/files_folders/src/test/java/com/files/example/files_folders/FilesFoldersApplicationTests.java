package com.files.example.files_folders;

import com.files.example.files_folders.models.File;
import com.files.example.files_folders.models.Folder;
import com.files.example.files_folders.repositories.FileRepository;
import com.files.example.files_folders.repositories.FolderRepository;
import com.files.example.files_folders.repositories.PersonRepository;
import org.hibernate.collection.internal.PersistentSortedMap;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class FilesFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	PersonRepository personRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		Folder folder = new Folder("Movies");
		folderRepository.save(folder);

		File file1 = new File("Batman", "mp4", 14000, folder);
		fileRepository.save(file1);
	}

}
