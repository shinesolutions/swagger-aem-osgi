//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties.g.dart';

/// ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties
///
/// Properties:
/// * [replicatePeriodCommentPeriodResourceTypes] 
@BuiltValue()
abstract class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties implements Built<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties, ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder> {
  @BuiltValueField(wireName: r'replicate.comment.resourceTypes')
  ConfigNodePropertyArray? get replicatePeriodCommentPeriodResourceTypes;

  ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties._();

  factory ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties([void updates(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder b)]) = _$ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties> get serializer => _$ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesSerializer();
}

class _$ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties, _$ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties];

  @override
  final String wireName = r'ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.replicatePeriodCommentPeriodResourceTypes != null) {
      yield r'replicate.comment.resourceTypes';
      yield serializers.serialize(
        object.replicatePeriodCommentPeriodResourceTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'replicate.comment.resourceTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.replicatePeriodCommentPeriodResourceTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesBuilder();
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

