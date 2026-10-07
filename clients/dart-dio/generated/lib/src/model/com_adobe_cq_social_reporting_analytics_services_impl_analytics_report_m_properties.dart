//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_properties.g.dart';

/// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties
///
/// Properties:
/// * [reportPeriodFetchPeriodDelay] 
@BuiltValue()
abstract class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties implements Built<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder> {
  @BuiltValueField(wireName: r'report.fetch.delay')
  ConfigNodePropertyInteger? get reportPeriodFetchPeriodDelay;

  ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties._();

  factory ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties([void updates(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder b)]) = _$ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties> get serializer => _$ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesSerializer();
}

class _$ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties, _$ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties];

  @override
  final String wireName = r'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.reportPeriodFetchPeriodDelay != null) {
      yield r'report.fetch.delay';
      yield serializers.serialize(
        object.reportPeriodFetchPeriodDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'report.fetch.delay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.reportPeriodFetchPeriodDelay.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder();
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

