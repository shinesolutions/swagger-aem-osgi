//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties.g.dart';

/// ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties
///
/// Properties:
/// * [size] 
@BuiltValue()
abstract class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties implements Built<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties, ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'size')
  ConfigNodePropertyInteger? get size;

  ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties._();

  factory ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties([void updates(ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder b)]) = _$ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties> get serializer => _$ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesSerializer();
}

class _$ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties, _$ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties];

  @override
  final String wireName = r'ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.size.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder();
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

