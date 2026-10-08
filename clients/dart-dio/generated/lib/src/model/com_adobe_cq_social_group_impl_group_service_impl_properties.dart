//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_group_impl_group_service_impl_properties.g.dart';

/// ComAdobeCqSocialGroupImplGroupServiceImplProperties
///
/// Properties:
/// * [maxWaitTime] 
/// * [minWaitBetweenRetries] 
@BuiltValue()
abstract class ComAdobeCqSocialGroupImplGroupServiceImplProperties implements Built<ComAdobeCqSocialGroupImplGroupServiceImplProperties, ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'maxWaitTime')
  ConfigNodePropertyInteger? get maxWaitTime;

  @BuiltValueField(wireName: r'minWaitBetweenRetries')
  ConfigNodePropertyInteger? get minWaitBetweenRetries;

  ComAdobeCqSocialGroupImplGroupServiceImplProperties._();

  factory ComAdobeCqSocialGroupImplGroupServiceImplProperties([void updates(ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder b)]) = _$ComAdobeCqSocialGroupImplGroupServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialGroupImplGroupServiceImplProperties> get serializer => _$ComAdobeCqSocialGroupImplGroupServiceImplPropertiesSerializer();
}

class _$ComAdobeCqSocialGroupImplGroupServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialGroupImplGroupServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialGroupImplGroupServiceImplProperties, _$ComAdobeCqSocialGroupImplGroupServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialGroupImplGroupServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialGroupImplGroupServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxWaitTime != null) {
      yield r'maxWaitTime';
      yield serializers.serialize(
        object.maxWaitTime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.minWaitBetweenRetries != null) {
      yield r'minWaitBetweenRetries';
      yield serializers.serialize(
        object.minWaitBetweenRetries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialGroupImplGroupServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'maxWaitTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxWaitTime.replace(valueDes);
          break;
        case r'minWaitBetweenRetries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minWaitBetweenRetries.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialGroupImplGroupServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder();
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

