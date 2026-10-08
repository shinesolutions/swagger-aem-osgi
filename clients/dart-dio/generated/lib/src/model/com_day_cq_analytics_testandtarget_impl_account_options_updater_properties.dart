//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_testandtarget_impl_account_options_updater_properties.g.dart';

/// ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties
///
/// Properties:
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodAccountoptionsupdaterPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties implements Built<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties, ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.analytics.testandtarget.accountoptionsupdater.enabled')
  ConfigNodePropertyBoolean? get cqPeriodAnalyticsPeriodTestandtargetPeriodAccountoptionsupdaterPeriodEnabled;

  ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties._();

  factory ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties([void updates(ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder b)]) = _$ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties> get serializer => _$ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesSerializer();
}

class _$ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties, _$ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodAccountoptionsupdaterPeriodEnabled != null) {
      yield r'cq.analytics.testandtarget.accountoptionsupdater.enabled';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodAccountoptionsupdaterPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.analytics.testandtarget.accountoptionsupdater.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodAccountoptionsupdaterPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder();
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

