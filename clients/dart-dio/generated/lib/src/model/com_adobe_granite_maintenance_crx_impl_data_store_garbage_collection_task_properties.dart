//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties.g.dart';

/// ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties
///
/// Properties:
/// * [granitePeriodMaintenancePeriodMandatory] 
/// * [jobPeriodTopics] 
@BuiltValue()
abstract class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties implements Built<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'granite.maintenance.mandatory')
  ConfigNodePropertyBoolean? get granitePeriodMaintenancePeriodMandatory;

  @BuiltValueField(wireName: r'job.topics')
  ConfigNodePropertyString? get jobPeriodTopics;

  ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties._();

  factory ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties([void updates(ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder b)]) = _$ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties> get serializer => _$ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesSerializer();
}

class _$ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties, _$ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties];

  @override
  final String wireName = r'ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.granitePeriodMaintenancePeriodMandatory != null) {
      yield r'granite.maintenance.mandatory';
      yield serializers.serialize(
        object.granitePeriodMaintenancePeriodMandatory,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.jobPeriodTopics != null) {
      yield r'job.topics';
      yield serializers.serialize(
        object.jobPeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'granite.maintenance.mandatory':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodMaintenancePeriodMandatory.replace(valueDes);
          break;
        case r'job.topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jobPeriodTopics.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder();
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

