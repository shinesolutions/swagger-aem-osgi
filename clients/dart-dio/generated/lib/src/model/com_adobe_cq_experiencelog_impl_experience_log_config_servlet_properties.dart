//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties.g.dart';

/// ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties
///
/// Properties:
/// * [enabled] 
/// * [disabledForGroups] 
@BuiltValue()
abstract class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties implements Built<ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties, ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'disabledForGroups')
  ConfigNodePropertyArray? get disabledForGroups;

  ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties._();

  factory ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties([void updates(ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder b)]) = _$ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties> get serializer => _$ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesSerializer();
}

class _$ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties, _$ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties];

  @override
  final String wireName = r'ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.disabledForGroups != null) {
      yield r'disabledForGroups';
      yield serializers.serialize(
        object.disabledForGroups,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'disabledForGroups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.disabledForGroups.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder();
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

