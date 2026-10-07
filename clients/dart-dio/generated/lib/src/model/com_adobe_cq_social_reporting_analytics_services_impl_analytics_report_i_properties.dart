//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_properties.g.dart';

/// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
///
/// Properties:
/// * [cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval] 
/// * [cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize] 
@BuiltValue()
abstract class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties implements Built<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.social.reporting.analytics.polling.importer.interval')
  ConfigNodePropertyInteger? get cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval;

  @BuiltValueField(wireName: r'cq.social.reporting.analytics.polling.importer.pageSize')
  ConfigNodePropertyInteger? get cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize;

  ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties._();

  factory ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties([void updates(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder b)]) = _$ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties> get serializer => _$ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesSerializer();
}

class _$ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties, _$ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties];

  @override
  final String wireName = r'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval != null) {
      yield r'cq.social.reporting.analytics.polling.importer.interval';
      yield serializers.serialize(
        object.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize != null) {
      yield r'cq.social.reporting.analytics.polling.importer.pageSize';
      yield serializers.serialize(
        object.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.social.reporting.analytics.polling.importer.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval.replace(valueDes);
          break;
        case r'cq.social.reporting.analytics.polling.importer.pageSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder();
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

