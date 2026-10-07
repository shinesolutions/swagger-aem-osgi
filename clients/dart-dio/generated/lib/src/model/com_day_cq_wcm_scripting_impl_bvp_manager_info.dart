//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_day_cq_wcm_scripting_impl_bvp_manager_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_scripting_impl_bvp_manager_info.g.dart';

/// ComDayCqWcmScriptingImplBVPManagerInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComDayCqWcmScriptingImplBVPManagerInfo implements Built<ComDayCqWcmScriptingImplBVPManagerInfo, ComDayCqWcmScriptingImplBVPManagerInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComDayCqWcmScriptingImplBVPManagerProperties? get properties;

  ComDayCqWcmScriptingImplBVPManagerInfo._();

  factory ComDayCqWcmScriptingImplBVPManagerInfo([void updates(ComDayCqWcmScriptingImplBVPManagerInfoBuilder b)]) = _$ComDayCqWcmScriptingImplBVPManagerInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmScriptingImplBVPManagerInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmScriptingImplBVPManagerInfo> get serializer => _$ComDayCqWcmScriptingImplBVPManagerInfoSerializer();
}

class _$ComDayCqWcmScriptingImplBVPManagerInfoSerializer implements PrimitiveSerializer<ComDayCqWcmScriptingImplBVPManagerInfo> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmScriptingImplBVPManagerInfo, _$ComDayCqWcmScriptingImplBVPManagerInfo];

  @override
  final String wireName = r'ComDayCqWcmScriptingImplBVPManagerInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmScriptingImplBVPManagerInfo object, {
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
        specifiedType: const FullType(ComDayCqWcmScriptingImplBVPManagerProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmScriptingImplBVPManagerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmScriptingImplBVPManagerInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComDayCqWcmScriptingImplBVPManagerProperties),
          ) as ComDayCqWcmScriptingImplBVPManagerProperties?;
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
  ComDayCqWcmScriptingImplBVPManagerInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmScriptingImplBVPManagerInfoBuilder();
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

