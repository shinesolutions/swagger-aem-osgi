//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties.g.dart';

/// ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties
///
/// Properties:
/// * [importerPeriodName] 
@BuiltValue()
abstract class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties implements Built<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties, ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder> {
  @BuiltValueField(wireName: r'importer.name')
  ConfigNodePropertyArray? get importerPeriodName;

  ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties._();

  factory ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties([void updates(ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder b)]) = _$ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties> get serializer => _$ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesSerializer();
}

class _$ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties, _$ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties];

  @override
  final String wireName = r'ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.importerPeriodName != null) {
      yield r'importer.name';
      yield serializers.serialize(
        object.importerPeriodName,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'importer.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.importerPeriodName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder();
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

