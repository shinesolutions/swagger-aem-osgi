//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties.g.dart';

/// ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties
///
/// Properties:
/// * [jobPeriodTopics] 
@BuiltValue()
abstract class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties implements Built<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties, ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'job.topics')
  ConfigNodePropertyString? get jobPeriodTopics;

  ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties._();

  factory ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties([void updates(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder b)]) = _$ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties> get serializer => _$ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesSerializer();
}

class _$ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties, _$ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties];

  @override
  final String wireName = r'ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder();
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

