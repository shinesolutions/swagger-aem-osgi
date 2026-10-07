//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties.g.dart';

/// ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties
///
/// Properties:
/// * [eventPeriodTopics] 
/// * [eventPeriodFilter] 
/// * [verbs] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties implements Built<ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties, ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.topics')
  ConfigNodePropertyString? get eventPeriodTopics;

  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  @BuiltValueField(wireName: r'verbs')
  ConfigNodePropertyArray? get verbs;

  ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties._();

  factory ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties([void updates(ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties> get serializer => _$ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties, _$ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodTopics != null) {
      yield r'event.topics';
      yield serializers.serialize(
        object.eventPeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.verbs != null) {
      yield r'verbs';
      yield serializers.serialize(
        object.verbs,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodTopics.replace(valueDes);
          break;
        case r'event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodFilter.replace(valueDes);
          break;
        case r'verbs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.verbs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder();
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

