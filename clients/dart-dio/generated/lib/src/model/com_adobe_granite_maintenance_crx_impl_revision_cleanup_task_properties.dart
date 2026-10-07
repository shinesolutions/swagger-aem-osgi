//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties.g.dart';

/// ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties
///
/// Properties:
/// * [fullPeriodGcPeriodDays] 
@BuiltValue()
abstract class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties implements Built<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties, ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'full.gc.days')
  ConfigNodePropertyArray? get fullPeriodGcPeriodDays;

  ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties._();

  factory ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties([void updates(ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder b)]) = _$ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties> get serializer => _$ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesSerializer();
}

class _$ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties, _$ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties];

  @override
  final String wireName = r'ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fullPeriodGcPeriodDays != null) {
      yield r'full.gc.days';
      yield serializers.serialize(
        object.fullPeriodGcPeriodDays,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'full.gc.days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fullPeriodGcPeriodDays.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder();
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

