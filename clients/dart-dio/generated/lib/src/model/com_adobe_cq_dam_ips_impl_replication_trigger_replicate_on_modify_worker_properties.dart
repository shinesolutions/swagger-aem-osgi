//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties.g.dart';

/// ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties
///
/// Properties:
/// * [dmreplicateonmodifyPeriodEnabled] 
/// * [dmreplicateonmodifyPeriodForcesyncdeletes] 
@BuiltValue()
abstract class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties implements Built<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties, ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder> {
  @BuiltValueField(wireName: r'dmreplicateonmodify.enabled')
  ConfigNodePropertyBoolean? get dmreplicateonmodifyPeriodEnabled;

  @BuiltValueField(wireName: r'dmreplicateonmodify.forcesyncdeletes')
  ConfigNodePropertyBoolean? get dmreplicateonmodifyPeriodForcesyncdeletes;

  ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties._();

  factory ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties([void updates(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder b)]) = _$ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties> get serializer => _$ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesSerializer();
}

class _$ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties, _$ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties];

  @override
  final String wireName = r'ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dmreplicateonmodifyPeriodEnabled != null) {
      yield r'dmreplicateonmodify.enabled';
      yield serializers.serialize(
        object.dmreplicateonmodifyPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.dmreplicateonmodifyPeriodForcesyncdeletes != null) {
      yield r'dmreplicateonmodify.forcesyncdeletes';
      yield serializers.serialize(
        object.dmreplicateonmodifyPeriodForcesyncdeletes,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dmreplicateonmodify.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.dmreplicateonmodifyPeriodEnabled.replace(valueDes);
          break;
        case r'dmreplicateonmodify.forcesyncdeletes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.dmreplicateonmodifyPeriodForcesyncdeletes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder();
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

