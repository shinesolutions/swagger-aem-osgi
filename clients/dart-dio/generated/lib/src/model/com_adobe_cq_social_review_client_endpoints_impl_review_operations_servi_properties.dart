//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties.g.dart';

/// ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties
///
/// Properties:
/// * [fieldWhitelist] 
/// * [attachmentTypeBlacklist] 
@BuiltValue()
abstract class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties implements Built<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties, ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder> {
  @BuiltValueField(wireName: r'fieldWhitelist')
  ConfigNodePropertyArray? get fieldWhitelist;

  @BuiltValueField(wireName: r'attachmentTypeBlacklist')
  ConfigNodePropertyArray? get attachmentTypeBlacklist;

  ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties._();

  factory ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties([void updates(ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder b)]) = _$ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties> get serializer => _$ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesSerializer();
}

class _$ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties, _$ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties];

  @override
  final String wireName = r'ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fieldWhitelist != null) {
      yield r'fieldWhitelist';
      yield serializers.serialize(
        object.fieldWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.attachmentTypeBlacklist != null) {
      yield r'attachmentTypeBlacklist';
      yield serializers.serialize(
        object.attachmentTypeBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'fieldWhitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fieldWhitelist.replace(valueDes);
          break;
        case r'attachmentTypeBlacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.attachmentTypeBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder();
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

