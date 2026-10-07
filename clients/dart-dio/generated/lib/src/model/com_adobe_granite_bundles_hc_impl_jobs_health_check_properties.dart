//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_bundles_hc_impl_jobs_health_check_properties.g.dart';

/// ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
/// * [maxPeriodQueuedPeriodJobs] 
@BuiltValue()
abstract class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties implements Built<ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties, ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'max.queued.jobs')
  ConfigNodePropertyInteger? get maxPeriodQueuedPeriodJobs;

  ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties._();

  factory ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties([void updates(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties> get serializer => _$ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties, _$ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.maxPeriodQueuedPeriodJobs != null) {
      yield r'max.queued.jobs';
      yield serializers.serialize(
        object.maxPeriodQueuedPeriodJobs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'max.queued.jobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodQueuedPeriodJobs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder();
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

