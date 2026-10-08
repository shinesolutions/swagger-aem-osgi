//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties.g.dart';

/// ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties
///
/// Properties:
/// * [flushPeriodAgents] 
@BuiltValue()
abstract class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties implements Built<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder> {
  @BuiltValueField(wireName: r'flush.agents')
  ConfigNodePropertyArray? get flushPeriodAgents;

  ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties._();

  factory ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties([void updates(ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder b)]) = _$ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties> get serializer => _$ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesSerializer();
}

class _$ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties, _$ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties];

  @override
  final String wireName = r'ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.flushPeriodAgents != null) {
      yield r'flush.agents';
      yield serializers.serialize(
        object.flushPeriodAgents,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'flush.agents':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.flushPeriodAgents.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder();
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

