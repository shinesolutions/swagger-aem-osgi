//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties.g.dart';

/// ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties
///
/// Properties:
/// * [reportingservicesPeriodUrl] 
@BuiltValue()
abstract class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties implements Built<ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties, ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'reportingservices.url')
  ConfigNodePropertyString? get reportingservicesPeriodUrl;

  ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties._();

  factory ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties([void updates(ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder b)]) = _$ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties> get serializer => _$ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesSerializer();
}

class _$ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties, _$ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties];

  @override
  final String wireName = r'ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.reportingservicesPeriodUrl != null) {
      yield r'reportingservices.url';
      yield serializers.serialize(
        object.reportingservicesPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'reportingservices.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.reportingservicesPeriodUrl.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder();
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

