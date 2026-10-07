//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties.g.dart';

/// OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties
///
/// Properties:
/// * [felixPeriodInventoryPeriodPrinterPeriodName] 
/// * [felixPeriodInventoryPeriodPrinterPeriodTitle] 
/// * [path] 
@BuiltValue()
abstract class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties implements Built<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder> {
  @BuiltValueField(wireName: r'felix.inventory.printer.name')
  ConfigNodePropertyString? get felixPeriodInventoryPeriodPrinterPeriodName;

  @BuiltValueField(wireName: r'felix.inventory.printer.title')
  ConfigNodePropertyString? get felixPeriodInventoryPeriodPrinterPeriodTitle;

  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties._();

  factory OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties([void updates(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder b)]) = _$OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties> get serializer => _$OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesSerializer();
}

class _$OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties, _$OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties];

  @override
  final String wireName = r'OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.felixPeriodInventoryPeriodPrinterPeriodName != null) {
      yield r'felix.inventory.printer.name';
      yield serializers.serialize(
        object.felixPeriodInventoryPeriodPrinterPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.felixPeriodInventoryPeriodPrinterPeriodTitle != null) {
      yield r'felix.inventory.printer.title';
      yield serializers.serialize(
        object.felixPeriodInventoryPeriodPrinterPeriodTitle,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'felix.inventory.printer.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.felixPeriodInventoryPeriodPrinterPeriodName.replace(valueDes);
          break;
        case r'felix.inventory.printer.title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.felixPeriodInventoryPeriodPrinterPeriodTitle.replace(valueDes);
          break;
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesBuilder();
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

