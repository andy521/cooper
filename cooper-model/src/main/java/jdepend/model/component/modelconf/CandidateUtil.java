package jdepend.model.component.modelconf;

public class CandidateUtil {

	public final static String IDDecollator = "#";

	public final static String getId(String place, String name) {
		if (place != null) {
			return place + IDDecollator + name;
		} else {
			return name;
		}
	}

	public final static String getId(Candidate candidate) {
		return getId(candidate.getPlace(), candidate.getName());
	}

	public final static String getPlace(String id) {
		if (containPlace(id)) {
			return id.substring(0, id.indexOf(IDDecollator));
		} else {
			return null;
		}
	}

	public final static String getName(String id) {
		if (containPlace(id)) {
			return id.substring(id.indexOf(IDDecollator) + 1);
		} else {
			return id;
		}
	}

	public final static boolean containPlace(String id) {
		return id.indexOf(IDDecollator) != -1;

	}
}
