//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_resourcemerger_picker_overriding_properties.g.dart';

/// OrgApacheSlingResourcemergerPickerOverridingProperties
///
/// Properties:
/// * [mergePeriodRoot] 
/// * [mergePeriodReadOnly] 
@BuiltValue()
abstract class OrgApacheSlingResourcemergerPickerOverridingProperties implements Built<OrgApacheSlingResourcemergerPickerOverridingProperties, OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder> {
  @BuiltValueField(wireName: r'merge.root')
  ConfigNodePropertyString? get mergePeriodRoot;

  @BuiltValueField(wireName: r'merge.readOnly')
  ConfigNodePropertyBoolean? get mergePeriodReadOnly;

  OrgApacheSlingResourcemergerPickerOverridingProperties._();

  factory OrgApacheSlingResourcemergerPickerOverridingProperties([void updates(OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder b)]) = _$OrgApacheSlingResourcemergerPickerOverridingProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingResourcemergerPickerOverridingProperties> get serializer => _$OrgApacheSlingResourcemergerPickerOverridingPropertiesSerializer();
}

class _$OrgApacheSlingResourcemergerPickerOverridingPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingResourcemergerPickerOverridingProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingResourcemergerPickerOverridingProperties, _$OrgApacheSlingResourcemergerPickerOverridingProperties];

  @override
  final String wireName = r'OrgApacheSlingResourcemergerPickerOverridingProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingResourcemergerPickerOverridingProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mergePeriodRoot != null) {
      yield r'merge.root';
      yield serializers.serialize(
        object.mergePeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.mergePeriodReadOnly != null) {
      yield r'merge.readOnly';
      yield serializers.serialize(
        object.mergePeriodReadOnly,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingResourcemergerPickerOverridingProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'merge.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mergePeriodRoot.replace(valueDes);
          break;
        case r'merge.readOnly':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.mergePeriodReadOnly.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingResourcemergerPickerOverridingProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder();
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

