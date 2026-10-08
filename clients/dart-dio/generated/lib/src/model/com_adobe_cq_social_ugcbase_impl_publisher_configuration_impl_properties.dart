//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties.g.dart';

/// ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties
///
/// Properties:
/// * [isPrimaryPublisher] 
@BuiltValue()
abstract class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties implements Built<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties, ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'isPrimaryPublisher')
  ConfigNodePropertyBoolean? get isPrimaryPublisher;

  ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties._();

  factory ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties([void updates(ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder b)]) = _$ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties> get serializer => _$ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesSerializer();
}

class _$ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties, _$ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isPrimaryPublisher != null) {
      yield r'isPrimaryPublisher';
      yield serializers.serialize(
        object.isPrimaryPublisher,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'isPrimaryPublisher':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.isPrimaryPublisher.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder();
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

