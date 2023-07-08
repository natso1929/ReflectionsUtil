package cn.natso.reflection;

import cn.natso.reflection.factory.DefaultObjectFactory;
import cn.natso.reflection.factory.ObjectFactory;
import cn.natso.reflection.wrapper.DefaultObjectWrapperFactory;
import cn.natso.reflection.wrapper.ObjectWrapperFactory;

/**
 * @author natso
 * @description 一些系统级别的元对象
 * @date 2023/7/8
 * @github https://github.com/natso1929
 */
public class SystemMetaObject {

    public static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    public static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
    public static final MetaObject NULL_META_OBJECT = MetaObject.forObject(NullObject.class, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);

    private SystemMetaObject() {
        // Prevent Instantiation of Static Class
    }

    /**
     * 空对象
     */
    private static class NullObject {
    }

    public static MetaObject forObject(Object object) {
        return MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
    }

}
