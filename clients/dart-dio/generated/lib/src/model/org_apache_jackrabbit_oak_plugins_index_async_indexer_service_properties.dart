//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
///
/// Properties:
/// * [asyncConfigs] 
/// * [leaseTimeOutMinutes] 
/// * [failingIndexTimeoutSeconds] 
/// * [errorWarnIntervalSeconds] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties implements Built<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'asyncConfigs')
  ConfigNodePropertyArray? get asyncConfigs;

  @BuiltValueField(wireName: r'leaseTimeOutMinutes')
  ConfigNodePropertyInteger? get leaseTimeOutMinutes;

  @BuiltValueField(wireName: r'failingIndexTimeoutSeconds')
  ConfigNodePropertyInteger? get failingIndexTimeoutSeconds;

  @BuiltValueField(wireName: r'errorWarnIntervalSeconds')
  ConfigNodePropertyInteger? get errorWarnIntervalSeconds;

  OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties._();

  factory OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties([void updates(OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties> get serializer => _$OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties, _$OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.asyncConfigs != null) {
      yield r'asyncConfigs';
      yield serializers.serialize(
        object.asyncConfigs,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.leaseTimeOutMinutes != null) {
      yield r'leaseTimeOutMinutes';
      yield serializers.serialize(
        object.leaseTimeOutMinutes,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.failingIndexTimeoutSeconds != null) {
      yield r'failingIndexTimeoutSeconds';
      yield serializers.serialize(
        object.failingIndexTimeoutSeconds,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.errorWarnIntervalSeconds != null) {
      yield r'errorWarnIntervalSeconds';
      yield serializers.serialize(
        object.errorWarnIntervalSeconds,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asyncConfigs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.asyncConfigs.replace(valueDes);
          break;
        case r'leaseTimeOutMinutes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.leaseTimeOutMinutes.replace(valueDes);
          break;
        case r'failingIndexTimeoutSeconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.failingIndexTimeoutSeconds.replace(valueDes);
          break;
        case r'errorWarnIntervalSeconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.errorWarnIntervalSeconds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder();
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

