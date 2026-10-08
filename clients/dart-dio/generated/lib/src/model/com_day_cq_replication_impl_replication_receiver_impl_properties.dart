//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_replication_receiver_impl_properties.g.dart';

/// ComDayCqReplicationImplReplicationReceiverImplProperties
///
/// Properties:
/// * [receiverPeriodTmpfilePeriodThreshold] 
/// * [receiverPeriodPackagesPeriodUsePeriodInstall] 
@BuiltValue()
abstract class ComDayCqReplicationImplReplicationReceiverImplProperties implements Built<ComDayCqReplicationImplReplicationReceiverImplProperties, ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'receiver.tmpfile.threshold')
  ConfigNodePropertyInteger? get receiverPeriodTmpfilePeriodThreshold;

  @BuiltValueField(wireName: r'receiver.packages.use.install')
  ConfigNodePropertyBoolean? get receiverPeriodPackagesPeriodUsePeriodInstall;

  ComDayCqReplicationImplReplicationReceiverImplProperties._();

  factory ComDayCqReplicationImplReplicationReceiverImplProperties([void updates(ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder b)]) = _$ComDayCqReplicationImplReplicationReceiverImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplReplicationReceiverImplProperties> get serializer => _$ComDayCqReplicationImplReplicationReceiverImplPropertiesSerializer();
}

class _$ComDayCqReplicationImplReplicationReceiverImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplReplicationReceiverImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplReplicationReceiverImplProperties, _$ComDayCqReplicationImplReplicationReceiverImplProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplReplicationReceiverImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplReplicationReceiverImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.receiverPeriodTmpfilePeriodThreshold != null) {
      yield r'receiver.tmpfile.threshold';
      yield serializers.serialize(
        object.receiverPeriodTmpfilePeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.receiverPeriodPackagesPeriodUsePeriodInstall != null) {
      yield r'receiver.packages.use.install';
      yield serializers.serialize(
        object.receiverPeriodPackagesPeriodUsePeriodInstall,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationImplReplicationReceiverImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'receiver.tmpfile.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.receiverPeriodTmpfilePeriodThreshold.replace(valueDes);
          break;
        case r'receiver.packages.use.install':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.receiverPeriodPackagesPeriodUsePeriodInstall.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationImplReplicationReceiverImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder();
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

