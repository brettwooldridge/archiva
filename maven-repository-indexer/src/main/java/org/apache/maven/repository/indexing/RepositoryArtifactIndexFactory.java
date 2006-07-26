package org.apache.maven.repository.indexing;

/*
 * Copyright 2005-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.artifact.repository.ArtifactRepository;

import java.io.File;

/**
 * Obtain an index instance.
 *
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 */
public interface RepositoryArtifactIndexFactory
{
    /**
     * Plexus role.
     */
    String ROLE = RepositoryArtifactIndexFactory.class.getName();

    /**
     * Method to create an instance of the standard index.
     *
     * @param indexPath  the path where the index will be created/updated
     * @param repository the repository where the indexed artifacts are located
     * @return the index instance
     */
    RepositoryArtifactIndex createStandardIndex( File indexPath, ArtifactRepository repository );

    /**
     * Method to create an instance of the minimal index.
     *
     * @param indexPath  the path where the index will be created/updated
     * @param repository the repository where the indexed artifacts are located
     * @return the index instance
     */
    RepositoryArtifactIndex createMinimalIndex( File indexPath, ArtifactRepository repository );
}
