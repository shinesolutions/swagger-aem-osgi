//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_properties.g.dart';

/// ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
///
/// Properties:
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties implements Built<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties, ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled')
  ConfigNodePropertyBoolean? get cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled;

  ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties._();

  factory ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties([void updates(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder b)]) = _$ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties> get serializer => _$ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesSerializer();
}

class _$ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties, _$ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled != null) {
      yield r'cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder();
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

