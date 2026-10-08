//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener_properties.g.dart';

/// ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties
///
/// Properties:
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodDeleteauthoractivitylistenerPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties implements Built<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties, ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.analytics.testandtarget.deleteauthoractivitylistener.enabled')
  ConfigNodePropertyBoolean? get cqPeriodAnalyticsPeriodTestandtargetPeriodDeleteauthoractivitylistenerPeriodEnabled;

  ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties._();

  factory ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties([void updates(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder b)]) = _$ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties> get serializer => _$ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesSerializer();
}

class _$ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties, _$ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodDeleteauthoractivitylistenerPeriodEnabled != null) {
      yield r'cq.analytics.testandtarget.deleteauthoractivitylistener.enabled';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodDeleteauthoractivitylistenerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.analytics.testandtarget.deleteauthoractivitylistener.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodDeleteauthoractivitylistenerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder();
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

