//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties.g.dart';

/// OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties
///
/// Properties:
/// * [totalWidth] 
/// * [colWidthName] 
/// * [colWidthResult] 
/// * [colWidthTiming] 
@BuiltValue()
abstract class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties implements Built<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder> {
  @BuiltValueField(wireName: r'totalWidth')
  ConfigNodePropertyInteger? get totalWidth;

  @BuiltValueField(wireName: r'colWidthName')
  ConfigNodePropertyInteger? get colWidthName;

  @BuiltValueField(wireName: r'colWidthResult')
  ConfigNodePropertyInteger? get colWidthResult;

  @BuiltValueField(wireName: r'colWidthTiming')
  ConfigNodePropertyInteger? get colWidthTiming;

  OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties._();

  factory OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties([void updates(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder b)]) = _$OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties> get serializer => _$OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesSerializer();
}

class _$OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties, _$OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties];

  @override
  final String wireName = r'OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.totalWidth != null) {
      yield r'totalWidth';
      yield serializers.serialize(
        object.totalWidth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.colWidthName != null) {
      yield r'colWidthName';
      yield serializers.serialize(
        object.colWidthName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.colWidthResult != null) {
      yield r'colWidthResult';
      yield serializers.serialize(
        object.colWidthResult,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.colWidthTiming != null) {
      yield r'colWidthTiming';
      yield serializers.serialize(
        object.colWidthTiming,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'totalWidth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.totalWidth.replace(valueDes);
          break;
        case r'colWidthName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.colWidthName.replace(valueDes);
          break;
        case r'colWidthResult':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.colWidthResult.replace(valueDes);
          break;
        case r'colWidthTiming':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.colWidthTiming.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesBuilder();
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

