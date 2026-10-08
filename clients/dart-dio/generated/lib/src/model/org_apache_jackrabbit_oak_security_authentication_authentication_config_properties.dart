//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_security_authentication_authentication_config_properties.g.dart';

/// OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
///
/// Properties:
/// * [orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName] 
/// * [orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties implements Built<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.jackrabbit.oak.authentication.appName')
  ConfigNodePropertyString? get orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName;

  @BuiltValueField(wireName: r'org.apache.jackrabbit.oak.authentication.configSpiName')
  ConfigNodePropertyString? get orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName;

  OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties._();

  factory OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties([void updates(OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties> get serializer => _$OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties, _$OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName != null) {
      yield r'org.apache.jackrabbit.oak.authentication.appName';
      yield serializers.serialize(
        object.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName != null) {
      yield r'org.apache.jackrabbit.oak.authentication.configSpiName';
      yield serializers.serialize(
        object.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.jackrabbit.oak.authentication.appName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName.replace(valueDes);
          break;
        case r'org.apache.jackrabbit.oak.authentication.configSpiName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder();
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

