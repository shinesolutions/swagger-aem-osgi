//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties.g.dart';

/// ComDayCqDamCoreImplServletDamContentDispositionFilterProperties
///
/// Properties:
/// * [cqPeriodMimePeriodTypePeriodBlacklist] 
/// * [cqPeriodDamPeriodEmptyPeriodMime] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties implements Built<ComDayCqDamCoreImplServletDamContentDispositionFilterProperties, ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.mime.type.blacklist')
  ConfigNodePropertyArray? get cqPeriodMimePeriodTypePeriodBlacklist;

  @BuiltValueField(wireName: r'cq.dam.empty.mime')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodEmptyPeriodMime;

  ComDayCqDamCoreImplServletDamContentDispositionFilterProperties._();

  factory ComDayCqDamCoreImplServletDamContentDispositionFilterProperties([void updates(ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletDamContentDispositionFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletDamContentDispositionFilterProperties> get serializer => _$ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletDamContentDispositionFilterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletDamContentDispositionFilterProperties, _$ComDayCqDamCoreImplServletDamContentDispositionFilterProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletDamContentDispositionFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletDamContentDispositionFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodMimePeriodTypePeriodBlacklist != null) {
      yield r'cq.mime.type.blacklist';
      yield serializers.serialize(
        object.cqPeriodMimePeriodTypePeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodDamPeriodEmptyPeriodMime != null) {
      yield r'cq.dam.empty.mime';
      yield serializers.serialize(
        object.cqPeriodDamPeriodEmptyPeriodMime,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletDamContentDispositionFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.mime.type.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodMimePeriodTypePeriodBlacklist.replace(valueDes);
          break;
        case r'cq.dam.empty.mime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodEmptyPeriodMime.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletDamContentDispositionFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletDamContentDispositionFilterPropertiesBuilder();
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

