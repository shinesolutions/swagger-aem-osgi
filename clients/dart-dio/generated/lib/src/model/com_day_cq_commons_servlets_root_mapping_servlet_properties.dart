//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_commons_servlets_root_mapping_servlet_properties.g.dart';

/// ComDayCqCommonsServletsRootMappingServletProperties
///
/// Properties:
/// * [rootmappingPeriodTarget] 
@BuiltValue()
abstract class ComDayCqCommonsServletsRootMappingServletProperties implements Built<ComDayCqCommonsServletsRootMappingServletProperties, ComDayCqCommonsServletsRootMappingServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'rootmapping.target')
  ConfigNodePropertyString? get rootmappingPeriodTarget;

  ComDayCqCommonsServletsRootMappingServletProperties._();

  factory ComDayCqCommonsServletsRootMappingServletProperties([void updates(ComDayCqCommonsServletsRootMappingServletPropertiesBuilder b)]) = _$ComDayCqCommonsServletsRootMappingServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqCommonsServletsRootMappingServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqCommonsServletsRootMappingServletProperties> get serializer => _$ComDayCqCommonsServletsRootMappingServletPropertiesSerializer();
}

class _$ComDayCqCommonsServletsRootMappingServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqCommonsServletsRootMappingServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqCommonsServletsRootMappingServletProperties, _$ComDayCqCommonsServletsRootMappingServletProperties];

  @override
  final String wireName = r'ComDayCqCommonsServletsRootMappingServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqCommonsServletsRootMappingServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.rootmappingPeriodTarget != null) {
      yield r'rootmapping.target';
      yield serializers.serialize(
        object.rootmappingPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqCommonsServletsRootMappingServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqCommonsServletsRootMappingServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'rootmapping.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.rootmappingPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqCommonsServletsRootMappingServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqCommonsServletsRootMappingServletPropertiesBuilder();
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

