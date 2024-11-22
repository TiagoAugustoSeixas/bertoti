package et.telebof.types;

import java.io.Serializable;
import java.util.Objects;

public class ForumTopicEdited  implements Serializable {

    public String name, icon_custom_emoji_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ForumTopicEdited that = (ForumTopicEdited) object;
        return Objects.equals(name, that.name) && Objects.equals(icon_custom_emoji_id, that.icon_custom_emoji_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, icon_custom_emoji_id);
    }
}
