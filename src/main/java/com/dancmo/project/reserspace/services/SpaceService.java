package com.dancmo.project.reserspace.services;

import com.dancmo.project.reserspace.persistence.entity.Space;

public interface SpaceService {
    boolean addSpace(Space space);
    boolean deleteSpace(String name, Space space);
    boolean updateSpace(String name,Space space);
    Space getSpaceByName(String name);
}
