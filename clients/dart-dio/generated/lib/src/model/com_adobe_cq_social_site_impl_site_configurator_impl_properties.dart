//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_site_impl_site_configurator_impl_properties.g.dart';

/// ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties
///
/// Properties:
/// * [componentsUsingTags] 
@BuiltValue()
abstract class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties implements Built<ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties, ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'componentsUsingTags')
  ConfigNodePropertyArray? get componentsUsingTags;

  ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties._();

  factory ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties([void updates(ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder b)]) = _$ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties> get serializer => _$ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesSerializer();
}

class _$ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties, _$ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.componentsUsingTags != null) {
      yield r'componentsUsingTags';
      yield serializers.serialize(
        object.componentsUsingTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'componentsUsingTags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.componentsUsingTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder();
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

