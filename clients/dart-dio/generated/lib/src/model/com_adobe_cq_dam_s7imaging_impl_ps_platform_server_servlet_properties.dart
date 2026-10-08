//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties.g.dart';

/// ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
///
/// Properties:
/// * [cachePeriodEnable] 
/// * [cachePeriodRootPaths] 
/// * [cachePeriodMaxSize] 
/// * [cachePeriodMaxEntries] 
@BuiltValue()
abstract class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties implements Built<ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties, ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cache.enable')
  ConfigNodePropertyBoolean? get cachePeriodEnable;

  @BuiltValueField(wireName: r'cache.rootPaths')
  ConfigNodePropertyArray? get cachePeriodRootPaths;

  @BuiltValueField(wireName: r'cache.maxSize')
  ConfigNodePropertyInteger? get cachePeriodMaxSize;

  @BuiltValueField(wireName: r'cache.maxEntries')
  ConfigNodePropertyInteger? get cachePeriodMaxEntries;

  ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties._();

  factory ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties([void updates(ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder b)]) = _$ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties> get serializer => _$ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesSerializer();
}

class _$ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties, _$ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties];

  @override
  final String wireName = r'ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cachePeriodEnable != null) {
      yield r'cache.enable';
      yield serializers.serialize(
        object.cachePeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cachePeriodRootPaths != null) {
      yield r'cache.rootPaths';
      yield serializers.serialize(
        object.cachePeriodRootPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cachePeriodMaxSize != null) {
      yield r'cache.maxSize';
      yield serializers.serialize(
        object.cachePeriodMaxSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cachePeriodMaxEntries != null) {
      yield r'cache.maxEntries';
      yield serializers.serialize(
        object.cachePeriodMaxEntries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cache.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cachePeriodEnable.replace(valueDes);
          break;
        case r'cache.rootPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cachePeriodRootPaths.replace(valueDes);
          break;
        case r'cache.maxSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cachePeriodMaxSize.replace(valueDes);
          break;
        case r'cache.maxEntries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cachePeriodMaxEntries.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

