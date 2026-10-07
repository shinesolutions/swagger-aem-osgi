//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties
///
/// Properties:
/// * [providerType] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties implements Built<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties, OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'providerType')
  ConfigNodePropertyDropDown? get providerType;

  OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties._();

  factory OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties([void updates(OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties> get serializer => _$OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties, _$OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.providerType != null) {
      yield r'providerType';
      yield serializers.serialize(
        object.providerType,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'providerType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.providerType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder();
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

