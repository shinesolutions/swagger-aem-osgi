//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_properties.g.dart';

/// ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties
///
/// Properties:
/// * [cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodSitesPeriodMapping] 
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties implements Built<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties, ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.social.console.analytics.sites.mapping')
  ConfigNodePropertyArray? get cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodSitesPeriodMapping;

  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties._();

  factory ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties([void updates(ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder b)]) = _$ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties> get serializer => _$ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesSerializer();
}

class _$ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties, _$ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties];

  @override
  final String wireName = r'ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodSitesPeriodMapping != null) {
      yield r'cq.social.console.analytics.sites.mapping';
      yield serializers.serialize(
        object.cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodSitesPeriodMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.priority != null) {
      yield r'priority';
      yield serializers.serialize(
        object.priority,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.social.console.analytics.sites.mapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodSocialPeriodConsolePeriodAnalyticsPeriodSitesPeriodMapping.replace(valueDes);
          break;
        case r'priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priority.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder();
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

