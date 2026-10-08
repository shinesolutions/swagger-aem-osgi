//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties.g.dart';

/// ComDayCqWcmCoreMvtMVTStatisticsImplProperties
///
/// Properties:
/// * [mvtstatisticsPeriodTrackingurl] 
@BuiltValue()
abstract class ComDayCqWcmCoreMvtMVTStatisticsImplProperties implements Built<ComDayCqWcmCoreMvtMVTStatisticsImplProperties, ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'mvtstatistics.trackingurl')
  ConfigNodePropertyString? get mvtstatisticsPeriodTrackingurl;

  ComDayCqWcmCoreMvtMVTStatisticsImplProperties._();

  factory ComDayCqWcmCoreMvtMVTStatisticsImplProperties([void updates(ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreMvtMVTStatisticsImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreMvtMVTStatisticsImplProperties> get serializer => _$ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreMvtMVTStatisticsImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreMvtMVTStatisticsImplProperties, _$ComDayCqWcmCoreMvtMVTStatisticsImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreMvtMVTStatisticsImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreMvtMVTStatisticsImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mvtstatisticsPeriodTrackingurl != null) {
      yield r'mvtstatistics.trackingurl';
      yield serializers.serialize(
        object.mvtstatisticsPeriodTrackingurl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreMvtMVTStatisticsImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mvtstatistics.trackingurl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mvtstatisticsPeriodTrackingurl.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreMvtMVTStatisticsImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder();
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

