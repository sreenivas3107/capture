package com.slk.capture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.Skill;
import com.slk.capture.repo.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepository;

	@Override
	public void addSkill(Skill skill) {
		skillRepository.save(skill);
	}
}
