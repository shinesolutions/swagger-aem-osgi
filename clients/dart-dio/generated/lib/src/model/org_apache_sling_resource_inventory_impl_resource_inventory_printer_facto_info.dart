//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_info.g.dart';

/// OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo implements Built<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties? get properties;

  OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo._();

  factory OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo([void updates(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder b)]) = _$OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo> get serializer => _$OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoSerializer();
}

class _$OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoSerializer implements PrimitiveSerializer<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo, _$OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo];

  @override
  final String wireName = r'OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties),
          ) as OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder();
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

