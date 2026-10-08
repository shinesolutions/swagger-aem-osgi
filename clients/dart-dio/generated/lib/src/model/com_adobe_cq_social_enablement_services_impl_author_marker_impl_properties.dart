//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_enablement_services_impl_author_marker_impl_properties.g.dart';

/// ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties
///
/// Properties:
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties implements Built<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties, ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties._();

  factory ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties([void updates(ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder b)]) = _$ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties> get serializer => _$ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesSerializer();
}

class _$ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties, _$ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder();
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

