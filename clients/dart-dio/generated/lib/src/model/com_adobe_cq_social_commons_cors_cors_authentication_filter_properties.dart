//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_cors_cors_authentication_filter_properties.g.dart';

/// ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
///
/// Properties:
/// * [corsPeriodEnabling] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties implements Built<ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties, ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'cors.enabling')
  ConfigNodePropertyBoolean? get corsPeriodEnabling;

  ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties._();

  factory ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties([void updates(ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties> get serializer => _$ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties, _$ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.corsPeriodEnabling != null) {
      yield r'cors.enabling';
      yield serializers.serialize(
        object.corsPeriodEnabling,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cors.enabling':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.corsPeriodEnabling.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder();
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

