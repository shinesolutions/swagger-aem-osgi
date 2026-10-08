//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_info.g.dart';

/// ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo implements Built<ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo, ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties? get properties;

  ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo._();

  factory ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo([void updates(ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder b)]) = _$ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo> get serializer => _$ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoSerializer();
}

class _$ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoSerializer implements PrimitiveSerializer<ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo, _$ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo];

  @override
  final String wireName = r'ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo object, {
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
        specifiedType: const FullType(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties),
          ) as ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties?;
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
  ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder();
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

