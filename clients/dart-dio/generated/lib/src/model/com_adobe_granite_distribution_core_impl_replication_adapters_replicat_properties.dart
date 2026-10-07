//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties.g.dart';

/// ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties
///
/// Properties:
/// * [providerName] 
/// * [forwardPeriodRequests] 
@BuiltValue()
abstract class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties implements Built<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties, ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder> {
  @BuiltValueField(wireName: r'providerName')
  ConfigNodePropertyString? get providerName;

  @BuiltValueField(wireName: r'forward.requests')
  ConfigNodePropertyBoolean? get forwardPeriodRequests;

  ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties._();

  factory ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties([void updates(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder b)]) = _$ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties> get serializer => _$ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesSerializer();
}

class _$ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties, _$ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties];

  @override
  final String wireName = r'ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.providerName != null) {
      yield r'providerName';
      yield serializers.serialize(
        object.providerName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.forwardPeriodRequests != null) {
      yield r'forward.requests';
      yield serializers.serialize(
        object.forwardPeriodRequests,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'providerName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.providerName.replace(valueDes);
          break;
        case r'forward.requests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.forwardPeriodRequests.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder();
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

