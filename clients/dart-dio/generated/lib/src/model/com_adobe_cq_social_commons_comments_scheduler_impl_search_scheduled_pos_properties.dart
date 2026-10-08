//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties.g.dart';

/// ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
///
/// Properties:
/// * [enableScheduledPostsSearch] 
/// * [numberOfMinutes] 
/// * [maxSearchLimit] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties implements Built<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties, ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder> {
  @BuiltValueField(wireName: r'enableScheduledPostsSearch')
  ConfigNodePropertyBoolean? get enableScheduledPostsSearch;

  @BuiltValueField(wireName: r'numberOfMinutes')
  ConfigNodePropertyInteger? get numberOfMinutes;

  @BuiltValueField(wireName: r'maxSearchLimit')
  ConfigNodePropertyInteger? get maxSearchLimit;

  ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties._();

  factory ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties([void updates(ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties> get serializer => _$ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties, _$ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enableScheduledPostsSearch != null) {
      yield r'enableScheduledPostsSearch';
      yield serializers.serialize(
        object.enableScheduledPostsSearch,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.numberOfMinutes != null) {
      yield r'numberOfMinutes';
      yield serializers.serialize(
        object.numberOfMinutes,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxSearchLimit != null) {
      yield r'maxSearchLimit';
      yield serializers.serialize(
        object.maxSearchLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enableScheduledPostsSearch':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableScheduledPostsSearch.replace(valueDes);
          break;
        case r'numberOfMinutes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.numberOfMinutes.replace(valueDes);
          break;
        case r'maxSearchLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxSearchLimit.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder();
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

