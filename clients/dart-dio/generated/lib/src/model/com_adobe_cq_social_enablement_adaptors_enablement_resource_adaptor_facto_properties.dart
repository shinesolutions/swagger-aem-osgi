//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties.g.dart';

/// ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties
///
/// Properties:
/// * [isMemberCheck] 
@BuiltValue()
abstract class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties implements Built<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties, ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder> {
  @BuiltValueField(wireName: r'isMemberCheck')
  ConfigNodePropertyBoolean? get isMemberCheck;

  ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties._();

  factory ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties([void updates(ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder b)]) = _$ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties> get serializer => _$ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesSerializer();
}

class _$ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties, _$ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties];

  @override
  final String wireName = r'ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isMemberCheck != null) {
      yield r'isMemberCheck';
      yield serializers.serialize(
        object.isMemberCheck,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'isMemberCheck':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.isMemberCheck.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder();
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

