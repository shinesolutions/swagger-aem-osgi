//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_http_sslfilter_ssl_filter_properties.g.dart';

/// OrgApacheFelixHttpSslfilterSslFilterProperties
///
/// Properties:
/// * [sslForwardPeriodHeader] 
/// * [sslForwardPeriodValue] 
/// * [sslForwardCertPeriodHeader] 
/// * [rewritePeriodAbsolutePeriodUrls] 
@BuiltValue()
abstract class OrgApacheFelixHttpSslfilterSslFilterProperties implements Built<OrgApacheFelixHttpSslfilterSslFilterProperties, OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'ssl-forward.header')
  ConfigNodePropertyString? get sslForwardPeriodHeader;

  @BuiltValueField(wireName: r'ssl-forward.value')
  ConfigNodePropertyString? get sslForwardPeriodValue;

  @BuiltValueField(wireName: r'ssl-forward-cert.header')
  ConfigNodePropertyString? get sslForwardCertPeriodHeader;

  @BuiltValueField(wireName: r'rewrite.absolute.urls')
  ConfigNodePropertyBoolean? get rewritePeriodAbsolutePeriodUrls;

  OrgApacheFelixHttpSslfilterSslFilterProperties._();

  factory OrgApacheFelixHttpSslfilterSslFilterProperties([void updates(OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder b)]) = _$OrgApacheFelixHttpSslfilterSslFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixHttpSslfilterSslFilterProperties> get serializer => _$OrgApacheFelixHttpSslfilterSslFilterPropertiesSerializer();
}

class _$OrgApacheFelixHttpSslfilterSslFilterPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixHttpSslfilterSslFilterProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixHttpSslfilterSslFilterProperties, _$OrgApacheFelixHttpSslfilterSslFilterProperties];

  @override
  final String wireName = r'OrgApacheFelixHttpSslfilterSslFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixHttpSslfilterSslFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.sslForwardPeriodHeader != null) {
      yield r'ssl-forward.header';
      yield serializers.serialize(
        object.sslForwardPeriodHeader,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.sslForwardPeriodValue != null) {
      yield r'ssl-forward.value';
      yield serializers.serialize(
        object.sslForwardPeriodValue,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.sslForwardCertPeriodHeader != null) {
      yield r'ssl-forward-cert.header';
      yield serializers.serialize(
        object.sslForwardCertPeriodHeader,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.rewritePeriodAbsolutePeriodUrls != null) {
      yield r'rewrite.absolute.urls';
      yield serializers.serialize(
        object.rewritePeriodAbsolutePeriodUrls,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixHttpSslfilterSslFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ssl-forward.header':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.sslForwardPeriodHeader.replace(valueDes);
          break;
        case r'ssl-forward.value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.sslForwardPeriodValue.replace(valueDes);
          break;
        case r'ssl-forward-cert.header':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.sslForwardCertPeriodHeader.replace(valueDes);
          break;
        case r'rewrite.absolute.urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.rewritePeriodAbsolutePeriodUrls.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixHttpSslfilterSslFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder();
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

