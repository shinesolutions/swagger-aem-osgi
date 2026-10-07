//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties.g.dart';

/// ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties
///
/// Properties:
/// * [reportingservicesPeriodProxyPeriodWhitelist] 
@BuiltValue()
abstract class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties implements Built<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties, ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder> {
  @BuiltValueField(wireName: r'reportingservices.proxy.whitelist')
  ConfigNodePropertyArray? get reportingservicesPeriodProxyPeriodWhitelist;

  ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties._();

  factory ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties([void updates(ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder b)]) = _$ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties> get serializer => _$ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesSerializer();
}

class _$ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties, _$ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties];

  @override
  final String wireName = r'ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.reportingservicesPeriodProxyPeriodWhitelist != null) {
      yield r'reportingservices.proxy.whitelist';
      yield serializers.serialize(
        object.reportingservicesPeriodProxyPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'reportingservices.proxy.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.reportingservicesPeriodProxyPeriodWhitelist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder();
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

